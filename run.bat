@echo off
set CP=libs/mysql-connector-j-9.1.0.jar;build/classes
javac -cp "%CP%" -d build/classes src/Application/Main.java
java -cp "%CP%" Application.Main
pause
@REM .\run.bat để chạy chương trình
