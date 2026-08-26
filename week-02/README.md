# Week 2 - Validated Parcel Intake and Receipt

## Learning target

Turn the Week 1 project charter into the first usable program feature: accept one parcel only when its details are valid, then print a desk-ready receipt.

## Validation rules

| Field | Rule | Example |
| --- | --- | --- |
| Parcel ID | `PKG-` followed by four digits | `PKG-1001` |
| Recipient ID | Two uppercase letters followed by four digits | `CK1021` |
| Parcel size | SMALL, MEDIUM or LARGE | `MEDIUM` |

## Run

```powershell
cd week-02
javac SmartLocker.java
java SmartLocker
```

## Acceptance checklist

- [x] A `Parcel` object holds the intake data.
- [x] Invalid parcel, recipient and size input is rejected.
- [x] A readable receipt contains the parcel, recipient, size, time and status.
- [x] A deterministic demonstration timestamp makes output proof repeatable.
- [x] The negative validation test is handled safely.

## Submission proof

Use the Week 2 commit link, `SmartLocker.java`, and `../docs/evidence/week-02-output.txt`.
