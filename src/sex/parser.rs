use pest::Parser;

#[derive(Parser)]
#[grammar = "sex/sex.pest"]
struct SexParser;

pub fn parse(code: &str) {
    match SexParser::parse(Rule::sex, code) {
        Err(e) => {
            let fancy_e = e.renamed_rules(|rule| {
                match *rule {
                    _ => {
                        format!("{:?}", rule)
                    }
                }
            });

            println!("{:?}", fancy_e);
        }
        Ok(pairs) => {
            println!("{:?}", pairs);
        }
    }
}

#[cfg(test)]
mod tests {
    use crate::sex::parser::parse;

    #[test]
    fn should_parse_sex() {
        let code = "(data (item) @demo)";
        parse(code);
    }
}