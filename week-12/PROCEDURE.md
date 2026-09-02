# Week 12 procedure — integrated final release

1. Create `$run = Join-Path $env:TEMP "pspj-smart-locker-week-12"`.
2. Compile `javac --release 17 -d $run .\week-12\SmartLocker.java`.
3. Change into the isolated directory: `Push-Location $run`.
4. Run `java -cp $run SmartLocker`, then return with `Pop-Location`.
5. Confirm three intakes, one collection, the ordered register report and local `parcel-register.txt` write.
6. Compare with [OUTPUT.txt](OUTPUT.txt).

This is a fictional classroom console simulation, not a real parcel or access-control system.
