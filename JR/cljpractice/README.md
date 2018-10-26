# Clojure with VS Code

## Clojure Steps
You must have Java and you will need to download Leiningen
Here is a link - https://djpowell.github.io/leiningen-win-installer/

#### Add code to existing string
After installation, navigate to the .lein.bat file in the .lein/bin directory
- mine was in C:/Users/sonof/.lein/bin
Open this file in an editor and add this code to line 157 after the first 
semicolon.  
```
[System.Net.ServicePointManager]::SecurityProtocol = [System.Net.SecurityProtocolType]::Tls12;
```
### Use command line for the next commands
##### - These commands do not work with Git Bash
```
lein self-install
```
#### Create a Clojure project in directory of your choosing
```
lein new projectname
```
#### To start the REPL
```
lein repl
```
## VS Code Steps
Open VS Code and add a Clojure extension that uses nREPL

Once that is done type 
```
shift + ctrl + p
```
In that dialog box start typing Clojure and look for 
```
Clojure: Connect to a running nREPL
```
Select that and it should ask a couple questions about ports and just select 
the default  
If it worked it will say connected and will show up at the bottom of the 
screen with the port number  
If it says you are already connected to a nREPL then type the shift + ctrl + p 
again and select 
```
Clojure: Disconnect from nREPL
```
Then try again and it should work  
### Good Luck!
