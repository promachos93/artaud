# Introduction #

Explain how to make Eclipse Plugin Mirror
Aim : Share with colleagues unique version of Eclipse plugin


# Requirements #
**Os : windows**<br />
1/ **Install on your system a JDK**<br />
_If you are have your JDK install on C:\Program~\Jre_<br />
then you can launch the script in standalone <br />

**If you have install your JDK elsewhere take off the strokes quote on ligne 8 as bellow :**
_SET JAVA=%JAVA\_HOME%\bin\java.exe_<br />

2/ configure Eclipse Path <br />

3/ Configure the equinox  jar path<br />
Change on the code the argument  : <br />
org.eclipse.equinox.launcher\_1.0.1.R33x\_v20080118.jar <br />

That's it !


# Launching #
Open a Cmd prompt on windows. <br />
Syntax:<br />
retrieve-eclipse-plugin-site.bat arg1 arg2 <br />
arg1: url of the plugin site <br />
arg2: Local path on windows machine <br />

# Example Launching #
C:\>retrieve-eclipse-plugin-site.bat http://pmd.sourceforge.net/eclipse/ C:\mirr
orEclipse


# Batch Code #
@ECHO OFF

IF "%1" == "" GOTO ParamError
IF "%1" == "" GOTO ParamError

SET ECLIPSE\_HOME=C:\eclipse

SET JAVA="%JAVA\_HOME%"\bin\java.exe

%JAVA% -jar %ECLIPSE\_HOME%\plugins\org.eclipse.equinox.launcher\_1.0.1.R33x\_v20080118.jar -application  org.eclipse.update.core.standaloneUpdate -command mirror -from %1 -to %2

:ParamError

ECHO Parameter error
ECHO usage:
ECHO %0 site\_url local\_path
ECHO Where :
ECHO site\_url is the url of the plugin site
ECHO local\_path is the location where the plugin site will be mirrored


  * Text in **bold** or _italic_
  * Headings, paragraphs, and lists
  * Automatic links to other wiki pages