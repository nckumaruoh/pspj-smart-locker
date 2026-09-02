# Week 1 procedure — project charter and Java baseline

1. Open PowerShell at the repository root.
2. Create an isolated run directory: `$run = Join-Path $env:TEMP "pspj-smart-locker-week-01"`.
3. Compile with `javac --release 17 -d $run .\week-01\SmartLocker.java`.
4. Run from the isolated directory with `java -cp $run SmartLocker`.
5. Compare the console transcript with [OUTPUT.txt](OUTPUT.txt).

Expected result: the project charter, user context and Week 2 target are printed.
