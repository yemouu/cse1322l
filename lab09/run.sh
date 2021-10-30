#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '%s\n' "1" \
		"3" \
		"5" \
		"1" \
		"5" \
		"0" \
		"2" \
		"15" \
		"5" \
		"2" \
		"15" \
		"2" \
		"2" \
		"15" \
		"0" \
		"2" \
		"2" \
		"10" \
		"3" \
		"7" \
		"2" \
		"3" \
		"10" \
		"3" \
		"3" \
		"10" \
		"0" \
		"0" | java Main
} > output.txt 2>&1
