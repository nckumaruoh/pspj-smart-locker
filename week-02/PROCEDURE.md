# Week 2 procedure — validated parcel intake

1. Create an isolated directory: `$run = Join-Path $env:TEMP "pspj-smart-locker-week-02"`.
2. Compile `javac --release 17 -d $run .\week-02\SmartLocker.java`.
3. Run `java -cp $run SmartLocker`.
4. Verify that one fixed valid parcel is accepted and an invalid parcel identifier is rejected.
5. Compare with [OUTPUT.txt](OUTPUT.txt).

The program uses a fixed demonstration time so its transcript is deterministic.
