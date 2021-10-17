#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '%s\n' "2" \
		"17" \
		"3" \
		"17" \
		"3" \
		"0" \
		"2" \
		"0" \
		"1" \
		"Baby Gaga" \
		"17" \
		"-1" \
		"2" \
		"19" \
		"3" \
		"19" \
		"4" | java Main
} > output.txt 2>&1
