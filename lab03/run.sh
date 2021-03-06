#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"

	# There are multiple Scanner objects so doing one printf will cause errors
	# Need time inbetween each for correct output.
	{
		printf '%s\n' "1"
		sleep 1
		printf '%s\n' "What is the capital of Georgia?" \
		              "Atlanta" \
		              "1"
		sleep 1
		printf '%s\n' "1"
		sleep 1
		printf '%s\n' "What is the name of the mascot for KSU?" \
		              "Scrappy" \
		              "1"
		sleep 1
		printf '%s\n' "1"
		sleep 1
		printf '%s\n' "How many fingers does a typical human have?" \
		              "6" \
		              "1"
		sleep 1
		printf '%s\n' "3"
		sleep 1
		printf '%s\n' "2" \
		              "How many fingers does a typical human have?" \
		              "5" \
		              "1"
		sleep 1
		printf '%s\n' "1"
		sleep 1
		printf '%s\n' "How many students does KSU have?" \
		              "41,000" \
		              "1"
		sleep 1
		printf '%s\n' "2"
		sleep 1
		printf '%s\n' "3"
		sleep 1
		printf '%s\n' "4"
		sleep 1
		printf '%s\n' "Atlanta" \
		              "Scrappy" \
		              "6"
		sleep 1
		printf '%s\n' "5"
	} | java Main
} > output.txt 2>&1
