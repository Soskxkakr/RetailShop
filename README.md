# Java - Retail Shop

## Recommended System Requirements
- Windows 10
- Apache Netbeans IDE 11.x

## Requirements
- JSON File (Admin, Customer, Item, Order, Product)
- Config.properties

## How to use Git in Apache Netbeans IDE
### Initialize the Git Repository
- Make a Java Project
- Go to the "Team" on the menu bar and select Git -> Initialize Repository
### Pull the Project
- Go to "Team" and select Git -> Remote -> Pull
- Enter Soskxkakr Git's URL and give your credentials (Git username and password)
- Pull from master's branch and finish
- (Optional) Commit (explained in Push the Project) first if an error occurs AFTER pulling
### Push the Project
- Create a new branch "Team", Git -> Branch/Tag -> Create Branch
- Checkout (move) from master's branch to the new branch. "Team", Git -> Branch/Tag -> Switch to branch
- Commit everything that has been updated/ modified by going to "Team" and select "Commit..." and select all files
- (Optional) If there are some changes made by other user, PULL the project first
- Finally push it. "Team" -> Git -> Remote -> Push. Select YOUR branch first and then master's branch
### After Pushing
- Delete your own branch. "Team" -> Git -> Repository -> Open Global Configuration
- Git Repository Browser will show up near the Output tab below
- Checkout back to master's branch by just double clicking it (Local not Remote)
- Right click YOUR branch and select "delete" in Local AND Remote as well.
- (Optional) If error occurs, Restart Netbeans.

How to test the program:
> **run** Main.java

**Note the program is completed but not perfect**
