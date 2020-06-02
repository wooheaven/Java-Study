```
$ ll ideaIC-2019.2.3-no-jbr.tar.gz
-rw-rw-r--  1 ubuntu ubuntu 564692551 10월  6 22:39 ideaIC-2019.2.3-no-jbr.tar.gz

$ sudo mkdir /usr/local/IntelliJ

$ ll /usr/local/IntelliJ/
total 8
drwxr-xr-x  2 root root 4096 10월  6 22:43 ./

$ sudo tar -zxf ideaIC-2019.2.3-no-jbr.tar.gz -C /usr/local/IntelliJ/
$ sudo ln -s /usr/local/IntelliJ/idea-IC-192.7142.36 /usr/local/IntelliJ/latest

$ ll /usr/local/IntelliJ/
total 12
drwxr-xr-x  4 root root 4096 11월 18 11:45 ./
drwxr-xr-x 12 root root 4096 10월  6 22:43 ../
drwxr-xr-x  7 root root 4096 11월 18 11:52 idea-IC-192.7142.36/
lrwxrwxrwx  1 root root   19 11월 17 21:32 latest -> idea-IC-192.7142.36/

$ vi ~/.bashrc
...
# IntelliJ
export IDEA_JDK="/usr/lib/jvm/java-8-openjdk-amd64/"

$ ./usr/local/IntelliJ/latest/bin/idea.sh
```

# If Cannot start IntelliJ IDEA : No JDK found. Please validate either IDEA_JDK ... points to JDK installation.
```
$ cat /usr/local/IntelliJ/latest/bin/idea.sh
...
if [ -z "$JDK" ] && [ -s "$HOME/.IdeaIC2019.3/config/idea.jdk" ]; then
  USER_JRE=$("$CAT" "$HOME/.IdeaIC2019.3/config/idea.jdk")
  if [ ! -d "$USER_JRE" ]; then
    USER_JRE="$IDE_HOME/$USER_JRE"
  fi
  if [ -x "$USER_JRE/bin/java" ]; then
    JDK="$USER_JRE"
  fi
fi

$ vi ~/.IdeaIC2019.3/config$ idea.jdk
/usr/lib/jvm/zulu8.44.0.11-ca-jdk8.0.242-linux_x64
```
