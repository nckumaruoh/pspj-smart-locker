# Week 3 procedure — menu routing

1. Create `$run = Join-Path $env:TEMP "pspj-smart-locker-week-03"`.
2. Compile `javac --release 17 -d $run .\week-03\SmartLocker.java`.
3. Run `java -cp $run SmartLocker`.
4. Confirm that choices 1–4 route to their named actions and choice 9 is invalid.
5. Compare with [OUTPUT.txt](OUTPUT.txt).
