# Git Workshop
[Github Cheat Sheet](https://github.github.com/training-kit/downloads/github-git-cheat-sheet.pdf "Github Cheat Sheet")


## Fork the remote respository
![alt text](src/img/fork.png "Fork Repo")


## Create your local respository

Create a folder for the repository:
```bash
$ mkdir <folder_name>
$ cd <folder_name>
```

Clone the fork into your new folder:
```bash
$ git clone https://github.com/<username>/GithubWorkshop

```
![alt text](src/img/clone.png "Clone Repo")



Go into the git directory:
```bash
$ cd GithubWorkshop

```

Review the remote repository:
```bash
$ git remote -v [-v | --verbose]
```

Open the Readme.md in your text editor


## Git Manual

Review help topics:

```bash
$ git help
```
>**TIP:** exit help by simply typing *q*

Review git branch:

```bash
$ git help branch
```

## Create and modify a local branch

Create a new feature branch:
```bash
$ git checkout
$ git branch <feature_yourname>
```
*shorthand version*
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
>TIP: *git add* stages your changes. You cannot commit your changes until you have first staged them.

Check the status of your changes: 
```bash
   $ git status
``` 

Remove delete_me.txt from your repo:
```bash
  $ git rm delete_me.txt
  $ git status
  $ git add . <your_name.txt>
```

```
Run a diff on the changes:
*good practice is to run a diff before every commit*
```bash
   $ git diff
```
Commit your changes: 
*"Commit early and commit often"*
```bash
   $ git commit 
   $ git status
``` 

>**TIP:**
Use git commit, rather than the shorthand
git commit -m "Add your commit message here"

Do a git log to see your changes:
```bash
   $ git log
```

Add a new line of text to your_name.txt

Run a diff on the changes:
```bash
   $ git status
   $ git diff
```

Commit your changes: 
```bash
   $ git commit
   $ git status
```

## Merge the master branch into your branch



First review all the branches:
```bash
   $ git branch -a
```

Checkout Master:
```bash
   $ git checkout master 
```

Pull updates from the remote:
```bash
   $ git pull 
```
>**TIP:** *git pull* merges changes from the remote into your local copy. Use *git fetch* if you simply want to download the latest to keep track of what is going on. You will then need to merge to incorporate the updates from *fetch*.

Checkout your local branch again:
```bash
   $ git checkout <feature_yourname>
```

Merge the updates from Master:
```bash
   $ git merge master
```

Push your branch to the remote: 
```bash
   $ git push -u origin <feature_yourname>
```
>**TIP:** You only need the *-u* command if your branch is not already upstream 

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
  $ git commit
```

Push the merged branches to the remote:
```bash
  $ git push origin master
```

resolve merge conflicts

delete your branch:
```bash
   $ git push --delete origin <feature_yourname>
   $ git branch -d <feature_yourname>
```
