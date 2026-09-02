# Week 11 procedure — collections and report stream

1. Create `$run = Join-Path $env:TEMP "pspj-smart-locker-week-11"`.
2. Compile `javac --release 17 -d $run .\week-11\SmartLocker.java`.
3. Run `java -cp $run SmartLocker`.
4. Confirm only READY parcels appear, sorted by parcel ID.
5. Compare with [OUTPUT.txt](OUTPUT.txt).
