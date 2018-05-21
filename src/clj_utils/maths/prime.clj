(ns clj-utils.maths.prime)

(defn prime? [x]
  (loop [i 2]
    (cond
      (or (= x 0)
          (= x 1)) false
      (> (* i i) x) true
      (zero? (mod x i)) false
      :else
      (recur (inc i)))))
