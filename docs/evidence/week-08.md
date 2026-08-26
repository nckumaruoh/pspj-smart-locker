# Week 8 — Exception handling and tests

Target: signal an unavailable locker as a domain error and handle it safely.

Evidence: allocation succeeds once; an unavailable allocation produces the handled message rather than terminating the application.
