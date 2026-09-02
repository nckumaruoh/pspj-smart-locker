# Campus Smart-Locker & Parcel Management System

This repository is the week-by-week submission space for the PSPJ project.

## Workflow

At the beginning of every week, pull the latest changes. Complete that week's target, compile and run the program, commit your work using the required message, then push it to GitHub. Submit the resulting commit link in the LMS.

## Week 1

Create the project charter and a runnable Java entry point.

```powershell
cd week-01
javac SmartLocker.java
java SmartLocker
```

Expected output:

```text
=== Campus Smart-Locker ===
Project: PSPJ Week 1
Status: project charter accepted
Next: build parcel intake in Week 2.
```

Commit message: `W01: charter and runnable project skeleton`

## Milestones

| Weeks | Outcome |
| --- | --- |
| 1–2 | Charter, Java skeleton, parcel intake and receipt |
| 3–4 | Routing logic and menu-driven operations |
| 5–6 | Methods, validation and array-based locker slots |
| 7–8 | Objects, exception handling and test cases |
| 9–10 | String algorithms and file persistence |
| 11–12 | Collections, streams and final release |

## Evidence

Every completed week includes its Java source, a reproducible `PROCEDURE.md`, a `TRACE.md` verification record and a captured `OUTPUT.txt`. The detailed [final documentation](docs/FINAL_DOCUMENTATION.md) maps all twelve learning increments to their source and evidence.

## Safe local verification

Run each milestone in an isolated directory so generated demonstration files do not affect the repository:

```powershell
$run = Join-Path $env:TEMP "pspj-smart-locker-week-01"
New-Item -ItemType Directory -Force -Path $run | Out-Null
javac --release 17 -d $run .\week-01\SmartLocker.java
Push-Location $run
java -cp $run SmartLocker
Pop-Location
```

Use the matching week number in the command. Weeks 10 and 12 intentionally create a small local demonstration file only inside that isolated run directory.
