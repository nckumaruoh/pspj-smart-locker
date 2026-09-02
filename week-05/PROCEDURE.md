# Week 5 procedure — locker slot allocation

1. Create `$run = Join-Path $env:TEMP "pspj-smart-locker-week-05"`.
2. Compile `javac --release 17 -d $run .\week-05\SmartLocker.java`.
3. Run `java -cp $run SmartLocker`.
4. Verify the first two medium parcels receive the two medium slots and the third is rejected.
5. Compare with [OUTPUT.txt](OUTPUT.txt).
