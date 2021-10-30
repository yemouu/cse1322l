#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n' "--- Output ---"

	printf '\n%s\n' "--- Run 1 ---"
	printf '%s\n' "42.47"  | java Main

	printf '\n%s\n' "--- Run 2 ---"
	printf '%s\n' "19.27"  | java Main

	printf '\n%s\n' "--- Run 3 ---"
	printf '%s\n' "220.10" | java Main
} > output.txt 2>&1
