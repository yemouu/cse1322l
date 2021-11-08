#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '\n%s\n' "--- Run 1 ---"
	printf '%s\n' "test.txt" | java Main
	printf '\n%s\n' "--- Run 2 ---"
	printf '%s\n' "bla" | java Main
} > output.txt 2>&1
