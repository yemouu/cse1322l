#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '\n%s\n' "--- Run 1 ---"
	printf '%s\n' "3" "1" "at" | java Main

	printf '\n%s\n' "--- Run 2 ---"
	printf '%s\n' "5" "2" "pp" | java Main

	printf '\n%s\n' "--- Run 3 ---"
	printf '%s\n' "3" "1" "a" | java Main
} > output.txt 2>&1
