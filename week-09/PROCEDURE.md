# Week 9 procedure — string normalization

1. Create `$run = Join-Path $env:TEMP "pspj-smart-locker-week-09"`.
2. Compile `javac --release 17 -d $run .\week-09\SmartLocker.java`.
3. Run `java -cp $run SmartLocker`.
4. Confirm whitespace/case normalization and the `PKG-` prefix check.
5. Compare with [OUTPUT.txt](OUTPUT.txt).
