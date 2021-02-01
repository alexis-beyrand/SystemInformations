package fr.wither.utils;

import java.io.File;
import java.lang.management.ManagementFactory;

import com.sun.management.OperatingSystemMXBean;

/**
 * 
 * Theone and only class of SystemInformations
 * @author Wither
 * @version 0.2.1
 * 
 */

public class SystemInformations {
	

	public SystemInformations() {
		
	}
	
	/**
	 * The factor between one byte and GigaByte : {@value}
	 */
	public static final long BYTES_TO_GO = 1073741824 ;
	
	/**
	 * Method to get total system's RAM
	 * @since 0.0.1
	 * @return
	 * The max pc's RAM /!\ May be underestimated
	 */
	public static final long getSystemRAM() {
		return ((OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize() / BYTES_TO_GO;
	}
	
	/**
	 * Method to get java architecture
	 * @since 0.0.1
	 * @return
	 * 	Unknown, 32 or 64 depending on java's architecture
	 */
	public static final String getJavaBits() {
		return System.getProperty("sun.arch.data.model");
	}
	
	/**
	 * Méthod to know total disk size
	 * @since 0.0.1
	 * @return
	 * total disk size
	 */
	public static final long getDiskSize() {
		return new File("/").getTotalSpace() / BYTES_TO_GO;
	}
	
	/**
	 * First method to get java version
	 * @since 0.0.1
	 * @return
	 * java version (X.X)
	 */
	public static final String getJavaVersion() {
		return System.getProperty("java.specification.version");
	}
	
	/**
	 * Second method to get java version
	 * @since 0.0.1
	 * @return
	 * java version (X.X.X_XXX)
	 */
	public static final String getExactJavaVersion() {
		return System.getProperty("java.version");
	}
	
	/**
	 * Method to know if the system is running on Windows or not
	 * @since 0.2.0
	 * @return
	 * True if it is windows, false otherwise
	 */
	public static final boolean isWindows() {
		return System.getProperty("sun.desktop").toLowerCase().contains("windows");
	}
	/**
	 * Method to get the OS name
	 * @since 0.2.0
	 * @return
	 * OS name
	 */
	public static final String getOSName() {
		return System.getProperty("os.name");
	}
	/**
	 * Method returning the user's name
	 * @since 0.2.0
	 * @return
	 * User's name
	 */
	public static final String getUserName() {
		return System.getProperty("user.name");
	}
}
