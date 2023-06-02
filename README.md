# DOEX Opdracht 2

## Casus: Festival Planner 

_**UNDER CONSTRUCTION**_ :building_construction:

# Casus van ChatGPT

## Mijn prompt

>I would like a simple DDD modelling exercise. Can you make it about a performance festival with visitors being able to make reservations and buy tickets. Also acts should have a maximum number of visitors.

## Antwoord

Sure, here's a simple DDD modelling exercise for a performance festival:

**Domain:** Performance Festival

**Actors:**

1. Festival Staff
2. Visitors

**Bounded Contexts:**

1. Ticketing
2. Scheduling

**Entities:**

1. Performance
2. Act
3. Visitor
4. Reservation
5. Ticket

**Value Objects:**

1. TimeSlot
2. SeatNumber

**Aggregates:**

1. PerformanceSchedule
2. ActReservation
3. VisitorReservation

**Repositories:**

1. PerformanceRepository
2. ActRepository
3. VisitorRepository
4. ReservationRepository
5. TicketRepository

**Domain Events:**

1. PerformanceScheduled
2. ActReserved
3. VisitorReserved
4. TicketPurchased

**Business Rules:**

1. Each performance has a maximum number of visitors allowed.
2. Visitors can make reservations for a performance up to a certain date and time.
3. Visitors can purchase tickets after the reservation period has ended.
4. Reservations are not guaranteed until they are confirmed by purchasing a ticket.
5. Visitors can reserve a maximum number of seats per performance.
6. Visitors can only reserve one seat per performance per reservation.
7. Visitors can only purchase one ticket per reservation.

**Example Workflow:**

1. Festival staff schedules a performance with a maximum number of visitors allowed.
2. Visitors can make reservations for the performance up to a certain date and time.
3. After the reservation period has ended, visitors can purchase tickets.
4. When a visitor makes a reservation, the system checks the maximum number of seats available and reserves the requested number of seats.
5. Once a visitor confirms their reservation by purchasing a ticket, the reservation is considered complete and the seats are no longer available for other visitors to reserve.
6. When a visitor tries to purchase a ticket for an event, the system checks if any other events are (partly) scheduled on the same time, and prevents the visitor from purchasing tickets for conflicting events.
