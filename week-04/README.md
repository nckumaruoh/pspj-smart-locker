# Week 4 - Size-Aware Locker Routing

## Learning target

Route valid parcel sizes to their locker zone before the allocation algorithm chooses a specific slot. Priority parcels use a separate route label without bypassing size rules.

## Acceptance checklist

- [x] SMALL, MEDIUM and LARGE map to their respective zones.
- [x] Priority status is preserved in the route output.
- [x] Unsupported sizes are rejected safely.
- [x] Routing has no dependency on a particular locker number.
