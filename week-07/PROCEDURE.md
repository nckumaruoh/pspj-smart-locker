# Week 7 procedure — parcel object

1. Create `$run = Join-Path $env:TEMP "pspj-smart-locker-week-07"`.
2. Compile `javac --release 17 -d $run .\week-07\SmartLocker.java`.
3. Run the explicit launcher class: `java -cp $run SmartLocker`.
4. Confirm that the `Parcel` object produces the receipt text.
5. Compare with [OUTPUT.txt](OUTPUT.txt).

Use the two-step compile/run workflow because this file also contains a helper class.
