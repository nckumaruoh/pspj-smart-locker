# Campus Smart-Locker & Parcel Management System — final documentation

## Scope

This is a fictional PSPJ classroom console project. It demonstrates parcel intake, allocation, collection and simple reporting using fixed, non-personal demonstration data. It is not connected to lockers, building access, delivery companies, accounts or network services.

## Requirements and safe execution

- JDK 21 was used for verification; each source was compiled with `javac --release 17`.
- Run each week in a fresh isolated directory, following its `PROCEDURE.md`.
- Weeks 10 and 12 create only local demonstration files in that isolated directory. No persistent production data is required or collected.

## Twelve-week implementation record

| Week | PSPJ increment | Verification evidence |
| --- | --- | --- |
| 01 | Project charter and runnable Java baseline | [procedure](../week-01/PROCEDURE.md) · [trace](../week-01/TRACE.md) · [output](../week-01/OUTPUT.txt) |
| 02 | Validated parcel intake and receipt | [procedure](../week-02/PROCEDURE.md) · [trace](../week-02/TRACE.md) · [output](../week-02/OUTPUT.txt) |
| 03 | Menu decision routing | [procedure](../week-03/PROCEDURE.md) · [trace](../week-03/TRACE.md) · [output](../week-03/OUTPUT.txt) |
| 04 | Size-aware conditional routing | [procedure](../week-04/PROCEDURE.md) · [trace](../week-04/TRACE.md) · [output](../week-04/OUTPUT.txt) |
| 05 | Methods, arrays and slot allocation | [procedure](../week-05/PROCEDURE.md) · [trace](../week-05/TRACE.md) · [output](../week-05/OUTPUT.txt) |
| 06 | Identifier and input validation | [procedure](../week-06/PROCEDURE.md) · [trace](../week-06/TRACE.md) · [output](../week-06/OUTPUT.txt) |
| 07 | Parcel object modelling | [procedure](../week-07/PROCEDURE.md) · [trace](../week-07/TRACE.md) · [output](../week-07/OUTPUT.txt) |
| 08 | Checked exception handling | [procedure](../week-08/PROCEDURE.md) · [trace](../week-08/TRACE.md) · [output](../week-08/OUTPUT.txt) |
| 09 | String normalization | [procedure](../week-09/PROCEDURE.md) · [trace](../week-09/TRACE.md) · [output](../week-09/OUTPUT.txt) |
| 10 | Local file persistence | [procedure](../week-10/PROCEDURE.md) · [trace](../week-10/TRACE.md) · [output](../week-10/OUTPUT.txt) |
| 11 | Collections and ordered stream report | [procedure](../week-11/PROCEDURE.md) · [trace](../week-11/TRACE.md) · [output](../week-11/OUTPUT.txt) |
| 12 | Integrated release: intake, collection, persistence and report | [procedure](../week-12/PROCEDURE.md) · [trace](../week-12/TRACE.md) · [output](../week-12/OUTPUT.txt) |

## Final-release behavior

The Week 12 program validates a fixed parcel identifier and size, allocates a compatible empty slot, marks an explicitly collected parcel as collected, writes a local register and prints the ordered current register. The captured transcript demonstrates all of those paths. Expected limitations are intentional for this educational increment: in-memory fixture data, no authentication, and no physical-locker integration.

## Submission checklist

- [x] Twelve independently compilable Java milestones
- [x] Week-by-week procedure, trace and captured console output
- [x] No generated class files or demo persistence files tracked
- [x] Final program run under an isolated writable directory
- [x] Incremental Git history and tags retained for review
