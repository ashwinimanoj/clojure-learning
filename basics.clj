; only space matters
nil
;; Literals

42
1.24
22/7 ; ratio
0xfff
6N
2.45M

(type 42)
(type 1.24)
(type 22/7)
(type 0xfff)
(type 6N)
(type 2.45M)

"hello"
\e
#"[0-9]+"
"This is a line
that can be on multiple lines"

(type "hello")
(type \e)
(type #"[0-9]+")
(type "This is a line
that can be on multiple lines")

true
(type true)

:something ; keyword
(type :something)

;;;;;;; Literal Collections

; list
'(1 2 3)
(type '(1 2 3))

; vector
[1 2 3]
(type [1 2 3])

; set
#{1 2 3}
(type #{1 2 3})

; map
{:a 1 :b 2}
(type {:a 1 :b 2})





