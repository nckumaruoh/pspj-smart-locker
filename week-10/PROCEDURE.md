# Week 10 procedure — local file persistence

1. Create `$run = Join-Path $env:TEMP "pspj-smart-locker-week-10"`.
2. Compile `javac --release 17 -d $run .\week-10\SmartLocker.java`.
3. Change into the isolated directory with `Push-Location $run`.
4. Run `java -cp $run SmartLocker`, then return with `Pop-Location`.
5. Confirm the local `parcel-log.txt` fixture is saved and read back; compare with [OUTPUT.txt](OUTPUT.txt).

The file is a local instructional fixture. It must be created only in the isolated run directory.
