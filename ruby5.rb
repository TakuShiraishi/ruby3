number = 48

if number % 3 == 0 && number % 5 == 0
  puts "15の倍数"
elsif number % 5 == 0
  puts "5の倍数です"
elsif number % 3 == 0
  puts "3の倍数です"
else
  puts "3の倍数でも5の倍数でもありません"
end

