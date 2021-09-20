#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '%s\n' "1" \
	              "67" \
	              "89" \
	              "2" \
	              "90" \
	              "89" \
	              "3" \
	              "65" \
	              "12" \
	              "4" \
	              "18" \
	              "2" \
	              "0" | java Main
} > output.txt 2>&1
