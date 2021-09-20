#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '%s\n' "7" \
	              "1" \
	              "2" \
	              "1" \
	              "3" \
	              "4.00" \
	              "7" \
	              "6" \
	              "5" \
	              "7" \
	              "8" | java Main
} > output.txt 2>&1
