#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '\n%s\n' "--- Run 1 ---"
	printf '%s\n' "abcd" "dcba" | java Main

	printf '\n%s\n' "--- Run 2 ---"
	printf '%s\n' "Skipping first 100 lines..."
	printf '%s\n' "a" "a" | java Main | tail -n +102

	printf '\n%s\n' "--- Run 3 ---"
	printf '%s\n' "Skipping first 100 lines..."
	printf '%s\n' "abcd" "ddba" | java Main | tail -n +102

	printf '\n%s\n' "--- Run 4 ---"
	printf '%s\n' "Skipping first 100 lines..."
	printf '%s\n' "" "" | java Main | tail -n +102
} > output.txt 2>&1
