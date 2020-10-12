package fr.wither.utils;

import java.io.File;
import java.lang.management.ManagementFactory;

import com.sun.management.OperatingSystemMXBean;

/**
 * 
 * La seule et unique classe de SystemInformations, elle contient les méthodes pour obtenir les information système.
 * @author Wither
 * @version 0.2.0
 * 
 */

public class SystemInformations {
	

	public SystemInformations() {
		
	}
	
	/**
	 * Choix du facteur entre un octet et un Go (Gio pour etre exact dans ce cas-ci) : {@value}
	 */
	public static final long BYTES_TO_GO = 1073741824 ;
	
	/**
	 * Méthode d'obtention de la RAM totale de l'ordinateur
	 * @since 0.0.1
	 * @return
	 * le maximum de mémoire vive(RAM) de l'ordinateur. /!\ peut être sous-estimée
	 */
	public static final long getSystemRAM() {
		return ((OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize() / BYTES_TO_GO;
	}
	
	/**
	 * Méthode d'obtention du type d'architecture java
	 * @since 0.0.1
	 * @return
	 * 	Unknown, 32 ou 64 suivant l'architecture java (32 bits, 64 bits, Inconnue/Indeterminable)
	 */
	public static final String getJavaBits() {
		return System.getProperty("sun.arch.data.model");
	}
	
	/**
	 * Méthode d'obtention de l'espace disque
	 * @since 0.0.1
	 * @return
	 * l'espace disque total
	 */
	public static final long getDiskSize() {
		return new File("/").getTotalSpace() / BYTES_TO_GO;
	}
	
	/**
	 * La première méthode pour la version de java
	 * @since 0.0.1
	 * @return
	 * la version java sous la forme X.X
	 */
	public static final String getJavaVersion() {
		return System.getProperty("java.specification.version");
	}
	
	/**
	 * La seconde méthode pour la version de java
	 * @since 0.0.1
	 * @return
	 * la version de java sous la forme X.X.X_XXX
	 */
	public static final String getExactJavaVersion() {
		return System.getProperty("java.version");
	}
	
	/**
	 * Méthode permettant de déterminer si le systeme est un windows ou non
	 * @since 0.2.0
	 * @return
	 * Une valeur booléenne vraie si le programme est lancé sur windows, faux sinon.
	 */
	public static final boolean isWindows() {
		return System.getProperty("sun.desktop").toLowerCase().contains("windows");
	}
	/**
	 * Méthode retournant le nom du système d'exploitation
	 * @since 0.2.0
	 * @return
	 * le nom de l'OS
	 */
	public static final String getOSName() {
		return System.getProperty("os.name");
	}
	/**
	 * Méthode retournant le nom de l'utilisateur du programme.
	 * @since 0.2.0
	 * @return
	 * Le nom d'utilisateur de la personne qui execute le programme
	 */
	public static final String getUserName() {
		return System.getProperty("user.name");
	}
}
