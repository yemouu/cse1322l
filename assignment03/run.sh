#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n' "--- Output ---"

	printf '\n%s\n' "--- Run 1 ---"
	printf '%s\n' "80" "80" | java Main

	printf '\n%s\n' "--- Run 2 ---"
	printf '%s\n' "32" "10" | java Main

	printf '\n%s\n' "--- Run 3 ---"
	printf '%s\n' "65" | java Main
} > output.txt 2>&1
