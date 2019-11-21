Making the Project Modular
===========================

Martin: Although I could just push my modularized project to the master branch, 
I don't want to because I've spent way too many hours trying to get the modularization
working, and I don't want to force my teammates to suffer through that pain.

If you do decide to make a modular version of this project, I have
written some "hints" as to how I achieved that. I call them "hints"
because even with an explanation it can still be confusing.

1. change VM Args
2. Add JavaFX user library to module path
3. [change module to "open"](https://web.archive.org/web/20191121152644/http://dineshbajajktn.blogspot.com/2017/11/how-to-get-past-inaccessibleobjectexcep.html) to allow [reflective access](https://docs.oracle.com/javase/9/docs/api/java/lang/reflect/package-summary.html) to methods
4. require the necessary modules from JavaFX
