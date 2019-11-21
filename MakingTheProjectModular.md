Making the Project Modular
===========================

Martin: Although I could just push my modularized project to the master branch, 
I don't want to because I've spent way too many hours trying to get the modularization
working, and I don't want to force my teammates to suffer through that pain.

If you do decide to make a modular version of this project, I have
written some "hints" as to how I achieved that. I call them "hints"
because even with an explanation it can still be confusing.

1. **Change VM Args**  
Eclipse IDE: `Right Click on java file > Run as > Run Configurations > go to "Arguments" tab`  
In the box labeled "VM Arguments", type:  
```
--module-path "C:\Program Files\Java\javafx-sdk-11.0.2\lib" 
--add-modules javafx.base,javafx.controls,javafx.fxml,javafx.graphics,javafx.media,javafx.swing,javafx.web
```  
but instead of `"C:\Program Files\Java\javafx-sdk-11.0.2\lib"`, put wherever you saved your JavaFX lib.

2. **Add JavaFX user library to module path**
3. **[Change module to "open"](https://web.archive.org/web/20191121152644/http://dineshbajajktn.blogspot.com/2017/11/how-to-get-past-inaccessibleobjectexcep.html) to allow [reflective access](https://docs.oracle.com/javase/9/docs/api/java/lang/reflect/package-summary.html) to methods. [(relevant SO question)](https://stackoverflow.com/questions/46482364/what-is-an-open-module-in-java-9-and-how-to-use-it)**
4. **Require the necessary modules from JavaFX**

Other Readings:
---------------
* [Module naming convention (SO Question)](https://stackoverflow.com/questions/43192741/how-should-i-name-my-java-9-module)
