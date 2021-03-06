/* zipdiff-ng is available under the terms of the
 * Apache License, version 2.0
 *
 * Link: http://www.apache.org/licenses/
 */

package zipdiff.util.commandline;

import com.beust.jcommander.Parameter;
import zipdiff.util.commandline.validators.InputFiles;
import zipdiff.util.commandline.validators.OutputFormat;

import java.util.ArrayList;
import java.util.List;

public class CommandLineArgs {
    @Parameter(description = "input files", arity = 2, required = true, validateWith = InputFiles.class)
    private List<String> inputFiles = new ArrayList<>();

    @Parameter(names = {"-output"}, description = "output file")
    private String outputFile = "-";

    @Parameter(names = {"-skipPrefix1"}, description = "number of prefixes to skip in base file")
    private int inputPrefixesToSkip = 0;

    @Parameter(names = {"-skipPrefix2"}, description = "number of prefixes to skip in compare file")
    private int comparePrefixesToSkip = 0;

    @Parameter(names = {"-skipOutputPrefix"}, description = "number of prefixes to skip in output")
    private int outputPrefixesToSkip = 0;

    @Parameter(names = {"-crc"}, description = "compare using crc values")
    private boolean compareCRCvalues = false;

    @Parameter(names = {"-ts"}, description = "compare using time stamp")
    private boolean compareTStamp = false;

    @Parameter(names = {"-filter"}, description = "regex of filenames to check")
    private String filenameFilter = ".*";

    @Parameter(names = {"-format"}, description = "format of output", validateWith = OutputFormat.class)
    private String outputFormat = "text";

    @Parameter(names = {"-n", "-noAction"}, description = "no action")
    private boolean noAction = false;

    @Parameter(names = {"--help", "-help"}, help = true)
    private boolean help = false;

    public List<String> getInputFiles(){
        return inputFiles;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public int getInputPrefixesToSkip() {
        return inputPrefixesToSkip;
    }

    public int getComparePrefixesToSkip() {
        return comparePrefixesToSkip;
    }

    public int getOutputPrefixesToSkip() {
        return outputPrefixesToSkip;
    }

    public boolean useCRCvalues() {
        return compareCRCvalues;
    }

    public boolean useTStamp() {
        return compareTStamp;
    }

    public String getFilter() {
        return filenameFilter;
    }

    public String getOutputFormat() {
        return outputFormat;
    }

    public boolean getNoAction() {
        return noAction;
    }

    public boolean isHelp() {
        return help;
    }
}
