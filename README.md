# Exercise 1
0. The library directory is an Eclipse ecore project.
1. Open the parent folder of library directory in Eclipse.
2. It should automatically detect the library project.
3. library.ecore represents the model of the library. 
4. library.aird contains the diagram, in this case, the diagram is the ecore model’s class diagram. 
5. library.genmodel is the generator model for the library.ecore for Java code generation. 
6. The *.xml files are the model instances of the library model, I tried to generate code with *.xmi but using Acceleo mets issues.
7. Folder mdu.mydsl and mdu.mydsl.* are the generated code from xtext. Right-click mdu.mydsl and run as Eclipse application can run the second instance of Eclipse with model language highlighting.
8. The javawithmydsl is the project which is in the second Eclipse instance having highlighting in the .mydsl file. 

Environment:
- Java 21 Amazon Corretto
- Eclipse 2024-06

