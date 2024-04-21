Install homebrew:
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)"

Install docker: brew install --cask docker

Install mysql: docker pull mysql

Create DB:
docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=myrootpassword -e MYSQL_DATABASE=test -e MYSQL_USER=test -e MYSQL_PASSWORD=test -p 3306:3306 -d mysql

To know which shell are you using, use the following command:
$ echo $SHELL
It will return something like:

/bin/bash
or
/bin/zsh

Steps to open mysql in docker:
1- open docker and start mysql in it.
2- go to terminal and type mysql -u root -p
3- enter the root password
4- use databasename;
5- 

![](../../../../../../../var/folders/n6/vfnq0nm54lj9c866r06qj68w0000gn/T/TemporaryItems/NSIRD_screencaptureui_DuoYDf/Screenshot 2024-04-21 at 8.07.38 AM.png)




![](../../../../../../../var/folders/n6/vfnq0nm54lj9c866r06qj68w0000gn/T/TemporaryItems/NSIRD_screencaptureui_FylirU/Screenshot 2024-04-21 at 8.12.42 AM.png)




.zshrc is a hidden file located in your Home directory aka /Users/$HOME. To view hidden files, open your Home folder and press Command + Shift + . Then open the .zshrc file in your text editor


