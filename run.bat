@echo off
set CP=libs/mysql-connector-j-9.1.0.jar;build/classes
javac -cp "%CP%" -d build/classes src/Package_01/Main.java
java -cp "%CP%" Package_01.Main
pause
@REM .\run.bat để chạy chương trình
