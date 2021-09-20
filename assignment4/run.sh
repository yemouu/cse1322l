#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	printf '%s\n' "I Need to figure out a way to test these properly. (Produce the same output)"
	#java Main
} > output.txt 2>&1
