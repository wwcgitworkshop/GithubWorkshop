#Git Workshop


## Create your local respository

Create a folder for the repository:
```bash
$ mkdir folder_name
$ cd folder_name
```

Clone the repo into your new folder:
```bash
$ git clone https://github.com/wwcgitworkshop/GithubWorkshop.git

```

Go into the git directory:
```bash
$ cd gitworkshop

```
Open the Readme.md in your text editor




## Create and modify a local branch

Create a new feature branch:
```bash
$ git checkout -b <feature_yourname>

```

Create a new file: **your_name.txt**

Copy this into <your_name.txt> file:

     <!---

      Questions TBD 

      -->

Add your_name.txt to the repo 
```bash
  $ git add . <your_name.txt>
```

Check the status of your changes: 
```bash
   $ git status
``` 

Remove delete_me.txt from your repo:
```bash
  $ git rm delete_me.txt
  $ git status
```

Commit your changes: 
```bash
   $ git commit -m "Add your commit message here"
   $ git status
``` 

Add a new line of text to your_name.txt

Run a diff on the changes:
```bash
   $ git diff
```

Commit these changes: 
```bash
   $ git commit -m "Add your commit message here"
   $ git status
```

## Merge the master branch into your branch

Checkout Master:
```bash
   $ git checkout master 
```

Fetch updates from the remote:
```bash
   $ git fetch 
```
Checkout your local branch again:
```bash
   $ git checkout <feature_yourname>
```

Merge the updates from Master:
```bash
   $ git merge master
```

Push your branch to the remote 
```bash
   $ push -u origin <feature_yourname>
```


## Merge your updates into master


Checkout Master and pull any updates:
```bash
   $ git checkout master 
   $ git pull
```
View the list of available branches: 
```bash
  $ git branch
```

Merge your branch:
```bash
   $ git merge <feature_yourname>
```

Commit the merged branches:
```bash
  $ git commit -m "Your commit messages goes here"
```

Push the merged branches to the remote:
```bash
  $ git push origin master
```
 

resolve merge conflicts

delete your branch
```bash
   $ git push --delete origin <feature_yourname>
   $ git branch -d <feature_yourname>
```







