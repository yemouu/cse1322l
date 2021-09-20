#!/bin/sh
# Compile and Run each assignment putting the output a file

for dir in *
do
	# Do nothing if not actually a directory
	[ -d "$dir" ] || continue

	# If a run script exist, run it in the background
	[ -x "$dir/run.sh" ] && {
		#printf '%s\n' "$dir: Executed"
		( cd "$dir" && ./run.sh) &
	}
done
