const plugin = require("tailwindcss/plugin");

module.exports = {
    content: ["./src/**/*.{html,js}"],
    darkMode: "class",
    theme: {
        corePlugins: {
            preflight: false,
        },
        extend: {
            important: true,
            container: {
                center: true,
                padding: "1.5rem",
                screens: {
                    sm: "640px",
                    md: "768px",
                    lg: "1024px",
                    xl: "1170px",
                },
            },
            fontFamily: {
                title: ["Oswald, sans-serif"],
                text: ["Open Sans, sans-serif"],
            },
            colors: {
                primary: "#000f1a",
            },
        },
    },
};
