# Xtext Tycho Example

This is a demo project showing how to build an Xtext project with tycho / maven. It features:

* Running the xtext generator mwe2 workflow from maven with help of the fornax mwe2 plugin
* Generated files are not checked, everything gets generated during the build and is ignored by git
* maven clean removes all previously generated artifacts
* Running the xtend2 compiler from maven
* Creating executable eclipse products containing the Xtext editor
    
This project uses the Eclipse Kepler release (4.3) as it's target platform.

Build Status: [![Build Status](https://travis-ci.org/ckulla/xtext-tycho-example.png)]

## Quick Start

The project is build by:

    $ cd releng/org.xtext.example.parent
    $ mvn package

## Licencse

Eclipse Public Licence, http://www.eclipse.org/legal/epl-v10.html
