package com.github.r0bert001.spk.packager;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name="spk")
public class PackageMojo
        extends AbstractMojo {

    /**
     * Package identity. No more than one version of a package can exist at the same time in the end user's DSM; therefore,
     * the identification is unique to identify your package. Besides, Package Center will create a /var/packages/[package identity] folder
     * to put package files.
     * Note: This value of the key cannot contain any of these special characters :, /, >, <, | or =.
     */
    @Parameter(property = "spk.package",defaultValue = "DemoSPK")
    private String packageName;

    /**
     * Package Center shows the name of the package.
     * Note: If displayName key is empty, Package Center will display the value of package key.
     */
    @Parameter(property = "spk.displayName",defaultValue = "Default Display Name")
    private String displayName;

    /**
     * Package version. End users can identify the package version.
     * Note:
     * 1. Each version delimiter is only allowed to be . - or _.
     * 2. Each version number which is delimited by delimiteris only allowed to be number
     */
    @Parameter(property = "spk.version")
    private String version;

    /**
     *  Earliest version of DSM that is required to run the package
     *  X.Y-Z DSM major number, DSM minor number, DSM build number
     */
    @Parameter(property = "spk.osMinVer",defaultValue = "6.1-14715")
    private String osMinVer;

    /**
     * Package Center shows a short description of the package.
     */
    @Parameter(property = "spk.desc")
    private String description;

    /**
     *  List the CPU architectures which can be used to install the package.
     *   (arch values are separated with a space. Please refer Appendix A: [Platform and Arch Value Mapping Table] to more
     * information)
     */
    private String arch = "noarch";

    /**
     *  Package Center shows the developer of the package.
     */
    @Parameter(property = "spk.maintainer")
    private String maintainer;

    /**
     *  72x72 png image data is encoded by Base64.
     */
    @Parameter(property = "spk.packageIcon",defaultValue = "a default icon")
    private String packageIcon;

    /**
     * 256x256 png image data is encoded by Base64
     */
    @Parameter(property = "spk.packageIcon256",defaultValue = "a default icon")
    private String packageIcon256;

    /**
     * If a package has a developer webpage, Package Center will show a link to let the user open it.
     */
    @Parameter(property = "spk.maintainerUrl")
    private String maintainerUrl;

    /**
     * If a package is installed and has a distributer webpage, Package Center will show a link to let the user open it.
     */
    @Parameter(property = "spk.distributor")
    private String distributor;

    /**
     * A package listens to a specific port to display its own UI. If the package is defined by a port, a link will be opened
     * when the package is started.
     * Value: 0~65536
     */
    @Parameter(property = "spk.adminPort",defaultValue = "80")
    private String adminPort;

    /**
     * If a package is installed and has a webpage, a link will be opened when the package is started.
     */
    @Parameter(property = "spk.adminUrl")
    private String adminUrl;

    /**
     * A package uses a specific protocol to display its own UI. If a package is installed and has a webpage, a protocol will
     * be opened when the package is started.
     * Value: http / https
     * (Separated with a space)
     */
    @Parameter(property = "spk.adminProtocol",defaultValue = "http")
    private String adminProtocol;

    public void execute() throws MojoExecutionException, MojoFailureException {

    }
}
