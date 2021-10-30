#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '\n%s\n' "--- Run 1 ---"
	printf '%s\n' "12:00:00" "16:30:01" | java Main

	printf '\n%s\n' "--- Run 2 ---"
	printf '%s\n' "26:00:00" | java Main

	printf '\n%s\n' "--- Run 3 ---"
	printf '%s\n' "12:20" | java Main

	printf '\n%s\n' "--- Run 4 ---"
	printf '%s\n' "12:76:01" | java Main

	printf '\n%s\n' "--- Run 5 ---"
	printf '%s\n' "2:15:00" "4:20:60" | java Main

	printf '\n%s\n' "--- Run 6 ---"
	printf '%s\n' "" | java Main

	printf '\n%s\n' "--- Run 7 ---"
	printf '%s\n' "16:00:00" "17:00" | java Main
} > output.txt 2>&1
