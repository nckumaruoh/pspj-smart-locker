# Week 6 procedure — identifier and size validation

1. Create `$run = Join-Path $env:TEMP "pspj-smart-locker-week-06"`.
2. Compile `javac --release 17 -d $run .\week-06\SmartLocker.java`.
3. Run `java -cp $run SmartLocker`.
4. Check the valid identifier/size pair and the two rejection paths.
5. Compare with [OUTPUT.txt](OUTPUT.txt).
