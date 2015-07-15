(ns algos.core
  (:gen-class))

(defn fact
  "Calculates the factorial value of the input"
  ([n] (fact n 1))
  ([n acc] (if (<= n 1)
                acc
                (recur (- n 1) (* acc n)))))

(defn fibo
  "Calculates the nth number in the Fibonacci sequence"
  ([n] (fibo n [0 1]))
  ([n prev] (let [min2 (first prev)
                  min1 (last prev)]
                  (if (<= n 1)
                    (nth prev n)
                    (recur (- n 1) [min1 (+ min1 min2)])))))
