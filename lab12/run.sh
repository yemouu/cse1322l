#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '\n%s\n' "--- Run 1 ---"
	printf '%s\n' "test1A.txt" "test1B.txt" | java Main

	printf '\n%s\n' "--- Run 2 ---"
	printf '%s\n' "test2A.txt" "test2B.txt" | java Main

	printf '\n%s\n' "--- Run 3 ---"
	printf '%s\n' "test3A.txt" "test3B.txt" | java Main
} > output.txt 2>&1
